package etsy;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class EtsySeller {
    private final String sellerId;
    private final String pictureUrl;
    private final int reviewsCount;
}
