package com.app.service;

import com.app.bo.Attachment;
import com.app.bo.Post;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/***
 * This is an in-mem storage for posts.
 * A similar logic can be implemented if we use a backend DB also.
 */

public class PostService {

    public static List<Post> postList = new ArrayList<>();


    public void addPost(Post post) {
        postList.add(post);
    }


    public static final String BASE_URL = "https://images.unsplash.com";

    public static final String CDN_APP_URL = "http://localhost:8001";

    public List<Post> loadAll() {

        if (postList.isEmpty()) {

            Post post1 = new Post();

            Attachment grassAttachment = new Attachment();

            grassAttachment.setFileUrl(CDN_APP_URL + "/photo-1593642634315-48f5414c3ad9");

            post1.setAttachments(List.of(grassAttachment));

            Post post2 = new Post();
            Attachment whiteHouseImage = new Attachment();
            whiteHouseImage.setFileUrl(CDN_APP_URL + "/photo-1517336714731-489689fd1ca8");
            post2.setAttachments(List.of(whiteHouseImage));

            Post post3 = new Post();
            Attachment lakeWithPavilion = new Attachment();
            lakeWithPavilion.setFileUrl(CDN_APP_URL + "/photo-1567306226416-28f0efdc88ce");
            post3.getAttachments().add(lakeWithPavilion);

            Post post4 = new Post();
            Attachment spicesAttachment = new Attachment();
            spicesAttachment.setFileUrl(CDN_APP_URL + "/photo-1498579809087-ef1e558fd1f3");
            post4.getAttachments().add(spicesAttachment);


            Post post5 = new Post();
            Attachment ninhBinh = new Attachment();
            ninhBinh.setFileUrl(CDN_APP_URL + "/photo-1506748686214-e9df14d4d9d0");
            post5.getAttachments().add(ninhBinh);

            Post post6 = new Post();
            Attachment coconutUnderPalm = new Attachment();
            coconutUnderPalm.setFileUrl(CDN_APP_URL + "/photo-1534081333815-ae5019106622");
            post6.getAttachments().add(coconutUnderPalm);


            Post post7 = new Post();
            Attachment someRandom = new Attachment();
            someRandom.setFileUrl(CDN_APP_URL + "/photo-1517816743773-6e0fd518b4a6");
            post7.getAttachments().add(someRandom);


            postList.add(post1);
            postList.add(post2);
            postList.add(post3);
            postList.add(post4);
            postList.add(post5);
            postList.add(post6);
            postList.add(post7);


        }

        return postList;
    }

    public void deletePost(String postId) {
        postList.removeIf(post -> post.getPostId().equals(postId));
    }

}
