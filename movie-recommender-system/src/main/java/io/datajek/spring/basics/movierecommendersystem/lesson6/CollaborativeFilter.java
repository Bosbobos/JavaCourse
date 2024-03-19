package lesson6;

import org.springframework.stereotype.Component;

@Component("CF")
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] { };
    }
}
