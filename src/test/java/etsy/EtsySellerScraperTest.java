package etsy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class EtsySellerScraperTest {
    private final EtsySellerScraper scraper = new EtsySellerScraper();

    @Test
    public void testGetSeller() {
        EtsySeller seller = scraper.getSeller("Neraidas").block();
        log.info("Seller: {}", seller);
    }
}
