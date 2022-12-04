<template>
  <div id="card-div" class="card">
    <h1 class="book-title">{{book.title}}</h1>
    <p class="book-author">{{book.author}}</p>
    <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
    <button type="button" class="mark-read" @click="markRead(book)" v-if="!book.read">Mark Read</button>
    <button type="button"  class="mark-unread" @click="markUnread(book)" v-if="book.read">Mark Unread</button>
  </div>
</template>

<script>
export default {
    name: 'book-card',
    read:false,
    props: ["book"],
    methods: {
        markRead(book){
            this.$store.commit("UPDATE_BOOK", book, true);
            document.getElementById("card-div").classList.push("read");
        },
        markUnread(book){
            this.$store.commit("UPDATE_BOOK", book, false);
            document.getElementById("card-div").classList.remove("read");
        }
    }
}
</script>

<style>
.card {
    border: 2px solid black;
    border-radius: 10px;
    width: 250px;
    height: 550px;
    margin: 20px;
}

.card.read {
    background-color: lightgray;
}

.card .book-title {
    font-size: 1.5rem;
}

.card .book-author {
    font-size: 1rem;
}
</style>