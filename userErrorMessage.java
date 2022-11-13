package com.example.btvnb2.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class userErrorMessage extends RuntimeException {
    private String message;
}
