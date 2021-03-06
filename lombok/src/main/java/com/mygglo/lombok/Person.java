package com.mygglo.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class Person {
 private Long id;
 private String firstName;
 private String lastName;
 private String telephone;
}
