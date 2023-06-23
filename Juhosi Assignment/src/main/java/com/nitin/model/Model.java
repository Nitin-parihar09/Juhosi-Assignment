package com.nitin.model;

public class Model {
	private String date;
	private String company;
	private String owner;
	private String item;
	private Integer quantity;
	private Float weight;
	private String request_for_shipment;
	private String tracking_id;
	private Integer box_count;
	private String specialization;
	private String checklist_quantity;
	
	public Model(String date, String company, String owner, String item, Integer quantity, Float weight,
			String request_for_shipment, String tracking_id, Integer box_count, String specialization,
			String checklist_quantity) {
		super();
		this.date = date;
		this.company = company;
		this.owner = owner;
		this.item = item;
		this.quantity = quantity;
		this.weight = weight;
		this.request_for_shipment = request_for_shipment;
		this.tracking_id = tracking_id;
		this.box_count = box_count;
		this.specialization = specialization;
		this.checklist_quantity = checklist_quantity;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Float getWeight() {
		return weight;
	}
	public void setWeight(Float weight) {
		this.weight = weight;
	}
	public String getRequest_for_shipment() {
		return request_for_shipment;
	}
	public void setRequest_for_shipment(String request_for_shipment) {
		this.request_for_shipment = request_for_shipment;
	}
	public String getTracking_id() {
		return tracking_id;
	}
	public void setTracking_id(String tracking_id) {
		this.tracking_id = tracking_id;
	}
	public Integer getBox_count() {
		return box_count;
	}
	public void setBox_count(Integer box_count) {
		this.box_count = box_count;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getChecklist_quantity() {
		return checklist_quantity;
	}
	public void setChecklist_quantity(String checklist_quantity) {
		this.checklist_quantity = checklist_quantity;
	}
	
	
}
