package lesson6;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("CBF")
@Primary
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
