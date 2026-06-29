package homework15.Task2.AdnotacjeGenerujaceMetody;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class GeneratingMethods {
    @ToString.Include
    @EqualsAndHashCode.Include
    private String name;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private int age;
}
