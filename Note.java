package com.example.rohan.notebook;

/**
 * Created by Rohan on 8/23/2016.
 */
public class Note {
    private String title, message;
    private long noteId, dateCreatedMilli;
    private Category category;

    // ^^^ Basic fields associated with the note

    public enum Category {PERSONAL, TECHNICAL, QUOTE, FINANCE}

    // Holds the categories for our note

    public Note(String title, String message, Category category) {
        this.title = title;
        this.message = message;
        this.category = category;
        this.noteId = 0;
        this.dateCreatedMilli = 0;

    }

    public Note(String title, String message, Category category, long noteId, long dateCreatedMilli) {
        this.title = title;
        this.message = message;
        this.category = category;
        this.noteId = 0;
        this.dateCreatedMilli = 0;

    }

    // ^^^ Constructors for this note class (you can pass in these certain variables and it will pass in our note fields into those things)

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public Category getCategory() {
        return category;
    }

    public long getDate() {
        return dateCreatedMilli;
    }

    public long getId() {
        return noteId;
    }

    public String toString() {
        return "ID: " + noteId + "Title: " + title + "Messsage" + message + "IconID: " + category.name() + "Date: ";
    }

    public static int categoryToDrawable(Category noteCategory) {

        switch (noteCategory) {
            case PERSONAL:
                return R.drawable.p;
            case TECHNICAL:
                return  R.drawable.t;
            case FINANCE:
                return R.drawable.f;
            case QUOTE:
                return R.drawable.q;

        }
        return R.drawable.p;
    }

    public int getAssociatedDrawable() {
        return categoryToDrawable(category);
    }
    }


    // ^^^ Functions to get the different fields of the note


