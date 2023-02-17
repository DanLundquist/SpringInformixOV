package no.ntnu.g3.PDE.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Parcel {
        @Id
        @GeneratedValue
        @Column(name = "Item ID")
        private Long itemId;
        @Column(name = "Weight")
        private Long a_weight;
        @Column(name = "Checkpoint ID")
        private Long b_checkpointId;
        @Column(name = "Order ID")
        private Long c_orderId;

        public Parcel() {
            super();
        }

        public Parcel(Long itemId, Long weight, Long checkpointId, Long orderId) {
            super();
            this.itemId = itemId;
            this.a_weight = weight;
            this.b_checkpointId = checkpointId;
            this.c_orderId = orderId;
        }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getWeight() {
        return a_weight;
    }

    public void setWeight(Long weight) {
        this.a_weight = weight;
    }

    public Long getCheckpointId() {
        return b_checkpointId;
    }

    public void setCheckpointId(Long checkpointId) {
        this.b_checkpointId = checkpointId;
    }

    public Long getOrderId() {
        return c_orderId;
    }

    public void setOrderId(Long orderId) {
        this.c_orderId = orderId;
    }

    @Override
    public String toString() {
        return String.format("Student [itemId=%s, a_weight =%s, b_checkpointId=%s, c_orderId=%s]", itemId, a_weight, b_checkpointId, c_orderId);
    }

}




