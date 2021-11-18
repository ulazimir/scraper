package etsy;

import reactor.core.publisher.Mono;

public interface EtsySellerProvider {

    Mono<EtsySeller> getSeller(String sellerId);

}
