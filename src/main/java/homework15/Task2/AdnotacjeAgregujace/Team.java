package homework15.Task2.AdnotacjeAgregujace;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@Builder
@ToString

public class Team {
    private String name;
    @Singular
    private List<String> members;
}
