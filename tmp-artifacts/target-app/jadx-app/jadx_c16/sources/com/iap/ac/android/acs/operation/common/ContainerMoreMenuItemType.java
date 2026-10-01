package com.iap.ac.android.acs.operation.common;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public enum ContainerMoreMenuItemType {
    Feedback(1),
    Notification(2),
    Favorite(3),
    Subscription(4),
    Rating(5);

    private final int value;

    ContainerMoreMenuItemType(int i) {
        this.value = i;
    }

    public static ContainerMoreMenuItemType parseValue(int i) {
        ContainerMoreMenuItemType containerMoreMenuItemType = Feedback;
        if (i != 1) {
            if (i == 2) {
                return Notification;
            }
            if (i == 3) {
                return Favorite;
            }
            if (i == 4) {
                return Subscription;
            }
            if (i == 5) {
                return Rating;
            }
        }
        return containerMoreMenuItemType;
    }

    public int getValue() {
        return this.value;
    }
}
