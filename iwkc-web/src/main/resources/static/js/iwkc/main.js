import Vue from "vue";
import Store from "./store/store"
import Router from "./router/router"
import App from "./App.vue"


import Vuetify from 'vuetify'
import colors from 'vuetify/es5/util/colors'

import 'vuetify/dist/vuetify.min.css'
import 'material-design-icons-iconfont/dist/fonts/material-icons.css'
import 'material-design-icons-iconfont/dist/material-design-icons.scss'


Vue.use(Vuetify, {
    theme: {
        primary: colors.red.darken1, // #E53935
        secondary: colors.red.lighten4, // #FFCDD2
        accent: colors.indigo.base // #3F51B5
    }
});

new Vue({
    el: '#main',
    render: h => h(App),
    store: Store,
    router: Router
});