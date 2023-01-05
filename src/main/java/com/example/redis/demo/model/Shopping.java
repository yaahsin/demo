package com.example.redis.demo.model;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Shopping")
public class Shopping implements Serializable {

	private static final long serialVersionUID = 1232075046725901468L;

	@Id
	private int id;
	private String name;
	private long price;
	
	
}