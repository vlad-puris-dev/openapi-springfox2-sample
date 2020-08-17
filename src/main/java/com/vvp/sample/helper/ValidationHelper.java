package com.vvp.sample.helper;

import java.util.regex.Pattern;

public class ValidationHelper {
    /**
     * Validate account identifier.
     * @param accountId account identifier
     * @return account identifier validation result
     */
    public static Boolean validAccountId(final String accountId) {
        return paramMatch("([0-9]{10})", accountId);
    }

    /**
     * Validate client identifier.
     * @param clientId client identifier
     * @return client identifier validation result
     */
    public static Boolean validClientId(final String clientId) {
        return paramMatch("([A-Z0-9]{5})", clientId);
    }

    /**
     * Compare if content match regex pattern.
     * @param pattern regex pattern
     * @param content content
     * @return comparation result if content match regex pattern
     */
    public static boolean paramMatch(final String pattern, final String content) {
        return Pattern.matches(pattern, content);
    }
}
