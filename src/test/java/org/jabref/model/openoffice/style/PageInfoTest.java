package org.jabref.model.openoffice.style;

import java.util.Optional;

import org.jabref.model.openoffice.ootext.OOText;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PageInfoTest {
    @Test
    void testNormalizePageInfo() {
        // CT1: Caso o valor de optionalText seja null
        assertEquals(Optional.empty(), PageInfo.normalizePageInfo(null));
        // CT2: Caso o valor de optionalText seja uma string vazia
        assertEquals(Optional.empty(), PageInfo.normalizePageInfo(Optional.of(OOText.fromString(""))));
        // CT3: Caso o valor de optionalText seja empty (Optional((Object)null))
        assertEquals(Optional.empty(), PageInfo.normalizePageInfo(Optional.empty()));
        // CT4: Caso o trim de uma string resulte em uma string vazia
        assertEquals(Optional.empty(), PageInfo.normalizePageInfo(Optional.of(OOText.fromString("         "))));
    }

}
