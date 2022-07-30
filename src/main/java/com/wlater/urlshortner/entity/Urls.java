package com.wlater.urlshortner.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("urls")
public class Urls {
	  @Id
	  private String id;
	  private String longUrl;
	  private String shorUrl;
	  private String urlCode;
	  private String date;
	  
}
