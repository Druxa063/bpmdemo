package com.company.bpmdemo.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "BPMDEMO_ORDER")
@Entity(name = "bpmdemo_Order")
public class Order extends AbstractEntity {
    private static final long serialVersionUID = -331304321598369005L;
    @OneToMany(mappedBy = "order")
    private List<Instrument> instruments;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERSON_ID")
    private Person person;
    @Column(name = "DATE")
    private Date date;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "DELIVERY")
    private String delivery;

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }

    public List<Instrument> getInstruments() {
        return instruments;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
}