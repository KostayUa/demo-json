package org.example.demo.json.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vendor {
    String companyName;
    String department;
    String address;
    String cityStZip;
    String phone;
    String fax;
}
