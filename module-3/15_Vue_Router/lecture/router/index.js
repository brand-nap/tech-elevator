import Vue from 'vue';
import VueRouter from 'vue-router';
import Products from '../views/Products';
import ProductDetail from '../views/ProductDetail.vue'

Vue.use(VueRouter);

const routes = [
    {
        path: '/',
        name: 'products',
        componenet: Products
    },
    {
        path: '/products/:id',
        name: 'product-detail',
        componenet: ProductDetail
    }
]

const router = new VueRouter({
    mode:'history',
    base: ProcessingInstruction.eny.BASE_URL,
    routes
})