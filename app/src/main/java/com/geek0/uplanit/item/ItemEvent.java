package com.geek0.uplanit.item;

import android.content.Context;

/**
 * Created by DapperGeek0
 * Date:Time 28-Dec-18:4:53 PM
 * Project uPlanItUpg
 */
public class ItemEvent {


   //private variables
   Context context;
//   SessionManager sessionManager;

   int id;
   private int userId;
   private String acctType;
   private String name;
   private String startDate;
   private String startTime;
   private String closeDate;
   private String closeTime;
   private String location;
   private String detail;
   private String imagePath;



   // Empty constructor
   public ItemEvent(){
   }

   // constructor
   public ItemEvent(String event_name,
                String imagePath,
                String start_date,
                String start_time,
                String end_date,
                String end_time,
                String location,
                String detail){
      this.name = event_name;
      this.imagePath = imagePath;
      this.startDate = start_date;
      this.startTime = start_time;
      this.closeDate = end_date;
      this.closeTime = end_time;
      this.location = location;
      this.detail = detail;
   }

   // constructor
   public ItemEvent(int id, int user_id){
      this.id = id;
      this.userId = user_id;
   }

   // getting ID
   public int getID(){
      return this.id;
   }

   // setting id
   public void setID(int id){
      this.id = id;
   }

   // getting sessionID
   public int getUserID(){
      return this.userId;
   }

   // getting ID
   public String getAccountType(){
      return this.acctType;
   }

   // getting name
   public String getName(){
      return this.name;
   }

   // setting name
   public void setName(String name){
      this.name = name;
   }

   // getting image
   public String getImage(){
      return this.imagePath;
   }

   // setting image
   public void setImage(String imagePath){
      this.imagePath = imagePath;
   }

   // getting start date
   public String getStartDate(){
      return this.startDate;
   }

   // setting start date
   public void setStartDate(String start_date){
      this.startDate = start_date;
   }

   // getting start time
   public String getStartTime(){
      return this.startTime;
   }

   // setting start time
   public void setStartTime(String start_time){
      this.startTime = start_time;
   }

   // getting end date
   public String getCloseDate(){
      return this.closeDate;
   }

   // setting end date
   public void setCloseDate(String end_date){
      this.closeDate = end_date;
   }

   // getting end time
   public String getCloseTime(){
      return this.closeTime;
   }

   // setting end time
   public void setCloseTime(String end_time){
      this.closeTime = end_time;
   }

   // getting location
   public String getLocation(){
      return this.location;
   }

   // setting location
   public void setLocation(String location){
      this.location = location;
   }

   // getting end time
   public String getDetail(){
      return this.detail;
   }

   // setting end time
   public void setDetail(String detail){
      this.detail = detail;
   }
}
