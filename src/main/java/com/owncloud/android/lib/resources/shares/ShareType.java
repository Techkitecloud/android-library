/* ownCloud Android Library is available under MIT license
 *   Copyright (C) 2015 ownCloud Inc.
 *   
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *   of this software and associated documentation files (the "Software"), to deal
 *   in the Software without restriction, including without limitation the rights
 *   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   copies of the Software, and to permit persons to whom the Software is
 *   furnished to do so, subject to the following conditions:
 *   
 *   The above copyright notice and this permission notice shall be included in
 *   all copies or substantial portions of the Software.
 *   
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, 
 *   EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 *   MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
 *   NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS 
 *   BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN 
 *   ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN 
 *   CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *   THE SOFTWARE.
 *
 */

package com.owncloud.android.lib.resources.shares;

/**
 * Enum for Share Type, with values:
 * -1 - No shared
 *  0 - Shared by user
 *  1 - Shared by group
 *  3 - Shared by public link
 *  4 - Shared by e-mail
 *  5 - Shared by contact
 *  6 - Shared by federation
 *  7 - Shared by circle
 *
 * @author masensio
 *
 */

public enum ShareType {
    INTERNAL(-3), // internal share link
    NEW_PUBLIC_LINK(-2), // only available in Android
    NO_SHARED(-1),
    USER(0),
    GROUP(1),
    // USERGROUP(2) // only internal
    PUBLIC_LINK(3),
    EMAIL(4),
    CONTACT(5),
    FEDERATED(6), // "remote" on server
    CIRCLE(7),
    GUEST(8),
    FEDERATED_GROUP(9), // "remote_group" on server
    ROOM(10),
    DECK(12);

    private final int value;

    ShareType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static ShareType fromValue(int value) {
        switch (value) {
            case -3:
                return INTERNAL;
            case -2:
                return NEW_PUBLIC_LINK;
            case 0:
                return USER;
            case 1:
                return GROUP;
            case 3:
                return PUBLIC_LINK;
            case 4:
                return EMAIL;
            case 5:
                return CONTACT;
            case 6:
                return FEDERATED;
            case 7:
                return CIRCLE;
            case 8:
                return GUEST;
            case 9:
                return FEDERATED_GROUP;
            case 10:
                return ROOM;
            case 12:
                return DECK;
            case -1:
            default:
                return NO_SHARED;
        }
    }
}
