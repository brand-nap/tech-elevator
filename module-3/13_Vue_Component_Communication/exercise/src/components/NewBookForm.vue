<template>
  <form v-on:submit.prevent="saveBook" class="new-book-form">
      <lable for="title">Title</lable>
      <input type="text" v-model="book.title" class="title-input"/>
      <lable for="author">Author</lable>
      <input type="text" v-model="book.author" class="author-input">
      <lable for="isbn">ISBN</lable>
      <input type="text" v-model="book.isbn" class="isbn-input">
      <button type="submit">Submit</button>
    </form>
</template>

<script>


export default {
    name: "new-book-form",
    data() {
        return {
            book: {
                title: "",
                author: "",
                read: false,
                isbn: ""
            }
        };
    },
    methods: {
        saveBook() {
            this.$store.commit("ADD_BOOK", this.book);
            
        }
    }
  
}
</script>

<style>

</style>