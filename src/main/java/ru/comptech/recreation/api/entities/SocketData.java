package ru.comptech.recreation.api.entities;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Setter
public class SocketData implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private Integer idDevice;
    @NonNull
    private Integer idPlace;
    @NonNull
    private Integer countPerson;
}
