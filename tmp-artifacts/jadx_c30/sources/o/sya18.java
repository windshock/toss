package o;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class sya18 {
    private static final Pattern onExtraCallbackWithResult;
    private static final Set<Character> onWarmupCompleted;
    private final String onNavigationEvent;

    static {
        HashSet hashSet = new HashSet();
        onWarmupCompleted = hashSet;
        onExtraCallbackWithResult = Pattern.compile("\\s");
        hashSet.add('[');
        hashSet.add(']');
        hashSet.add('{');
        hashSet.add('}');
        hashSet.add(',');
        hashSet.add('*');
        hashSet.add('&');
    }

    public sya18(String str) {
        Objects.requireNonNull(str);
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Empty anchor.");
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (onWarmupCompleted.contains(Character.valueOf(cCharAt))) {
                throw new sya7("Invalid character '" + cCharAt + "' in the anchor: " + str);
            }
        }
        if (onExtraCallbackWithResult.matcher(str).find()) {
            throw new sya7("Anchor may not contain spaces: " + str);
        }
        this.onNavigationEvent = str;
    }

    public String onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public String toString() {
        return this.onNavigationEvent;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.onNavigationEvent, ((sya18) obj).onNavigationEvent);
    }

    public int hashCode() {
        return Objects.hash(this.onNavigationEvent);
    }
}
