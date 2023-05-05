package com.workshop.workshop.system.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.workshop.workshop.system.entities.enums.OrderStatus;
import jakarta.persistence.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {
    private static final Long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'",timezone = "GMT")
    private Instant moment;
   private Integer orderStatus;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;
    @OneToMany(mappedBy = "id.order")
    private Set<OrderItem> items = new HashSet<>();
    @OneToOne(mappedBy = "order",cascade = CascadeType.ALL)//para mapear as duas entidaes para ter o mesmo ID, o mesmo código para ambas
    private Payament payament;
    public Order(){
    }

    public Order(Long id, Instant moment, OrderStatus orderStatus, User client) {
        this.id = id;
        this.moment = moment;
       setOrderStatus(orderStatus);
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

   public OrderStatus getOrderStatus(){
        return OrderStatus.ValueOf(orderStatus);
   }
    public void setOrderStatus(OrderStatus orderStatus) {
        if(orderStatus != null) {//para verificar se o valor passado é nulo
            this.orderStatus = orderStatus.getCode();
        }
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public Payament getPayament() {
        return payament;
    }

    public void setPayament(Payament payament) {
        this.payament = payament;
    }

    public Set<OrderItem> getItems() {
        return items;
    }
    public Double getTotal(){
      double  sum = 0.0;
      for (OrderItem x : items){
          sum += x.getSubTotal();
      }
      return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
