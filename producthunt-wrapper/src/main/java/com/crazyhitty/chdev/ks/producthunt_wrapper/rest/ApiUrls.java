/*
 * MIT License
 *
 * Copyright (c) 2016 Kartik Sharma
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.crazyhitty.chdev.ks.producthunt_wrapper.rest;

/**
 * Author:      Kartik Sharma
 * Email Id:    cr42yh17m4n@gmail.com
 * Created:     12/26/2016 9:51 PM
 * Description: Unavailable
 */

class ApiUrls {
    // Requires normal auth token
    static final String GET_POSTS = "posts/all";
    static final String GET_POSTS_BY_CATEGORY_DAYWISE = "categories/{category_name}/posts";
    static final String GET_POSTS_DETAILS = "posts/{post_id}";
    static final String GET_POST_COMMENTS = "posts/{post_id}/comments";
    static final String GET_COLLECTIONS = "collections";
    static final String GET_COLLECTIONS_DETAILS = "collections/{collection_id}";
    static final String GET_USER_PROFILE = "users/{user_id}";
    static final String GET_CATEGORIES = "categories";

    static final String SEARCH = "*/queries?" + Constants.SEARCH_X_ANGOLIA_AGENT + "=" + Authorization.X_ANGOLIA_AGENT + "&" +
            Constants.SEARCH_X_ANGOLIA_APPLICATION_ID + "=" + Authorization.X_ANGOLIA_APPLICATION_ID + "&" +
            Constants.SEARCH_X_ANGOLIA_API_KEY + "=" + Authorization.X_ANGOLIA_API_KEY;
    //static final String SEARCH_POSTS = "Post_production/query";
    //static final String SEARCH_COLLECTIONS = "Collection_production/query";

    // Requires public+private auth token
    static final String MY_PROFILE = "me";

    // Oauth authentications
    static final String OAUTH_GET_TOKEN = "oauth/token";
    static final String OAUTH_USER_AUTHENTICATION = "oauth/authorize";

    private ApiUrls() {

    }
}
