package com.geek0.uplanit.item;

/**
 * Created by DapperGeek0
 * Date:Time 28-Dec-18:4:29 PM
 * Project uPlanItUpg
 */
public class ItemBrand {
   private String id, brandName, details, address;
   private String verification, category, phone, logo;

   public ItemBrand(){
      // TODO: empty constructor stub
   }

   public void setId(String id){
      this.id = id;
   }

   public String getId(){
      return this.id;
   }

   public void setName(String brandName){
      this.brandName = brandName;
   }

   public String getName(){
      return this.brandName;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getAddress(){
      return this.address;
   }

   public void setDetails(String details) {
      this.details = details;
   }

   public String getDetails() {
      return details;
   }

   public void setPhone(String phone){
      this.phone = phone;
   }

   public String getPhone(){
      return this.phone;
   }

   public void setLogo(String logo) {
      this.logo = logo;
   }

   public String getLogo() {
      return logo;
   }

   public void setCategory(String category) {
      this.category = category;
   }

   public String getCategory() {
      return category;
   }

   public void setVerification(String verification) {
      this.verification = verification;
   }

   public String getVerification() {
      return verification;
   }
}
