<template>
  <div class="book-container" v-for:>
    <book-card></book-card>
  </div>
</template>

<script>
import BookCard from './BookCard.vue'
 
export default {
    name: 'reading-list',
    components: [
      BookCard
      ],
    props: ['books']
}
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>