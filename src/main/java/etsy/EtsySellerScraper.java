package etsy;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class EtsySellerScraper implements EtsySellerProvider {
    private final WebClient webClient;

    public EtsySellerScraper() {
        webClient = null;// TODO
    }

    @Override
    public Mono<EtsySeller> getSeller(String sellerId) {
        return Mono.empty(); // TODO
    }
}
