/**
 * Created by geshiying on 2017/5/2.
 */
new Vue({
    el:'appSubmit',
    data:{
        username:'',
        phone:'',
        submit:""

    },
     methods:{
            get:function(){
                //发送get请求
                this.$http.get('/queryUserByIdCustom').then(function(res){
                    document.write(res.body);
                },function(){
                    console.log('请求失败处理');
                });
            }
        }
})
// var vm = new Vue({
//     el: '#app',
//     data: {
//         newPerson: {
//             name: '',
//             age: 0,
//             sex: 'Male'
//         },
//         people: [{
//             name: 'Jack',
//             age: 30,
//             sex: 'Male'
//         }, {
//             name: 'Bill',
//             age: 26,
//             sex: 'Male'
//         }, {
//             name: 'Tracy',
//             age: 22,
//             sex: 'Female'
//         }, {
//             name: 'Chris',
//             age: 36,
//             sex: 'Male'
//         }]
//     },
//     methods:{
//         createPerson: function(){
//             this.people.push(this.newPerson);
//             // 添加完newPerson对象后，重置newPerson对象
//             this.newPerson = {name: '', age: 0, sex: 'Male'}
//         },
//         deletePerson: function(index){
//             // 删一个数组元素
//             this.people.splice(index,1);
//         }
//     }
// });
// var app1 = new Vue({
//     el:'#app1',
//     data:{
//         messages:'Hello Vue'
//     }
// });
// var app2 = new Vue({
//     el:'#app2',
//     data:{
//         message:'页面加载于'+ new Date()
//     }
// });
// var app3 = new Vue({
//     el:'#app3',
//     data:{
//         seen:true
//     }
// });
// var app4 = new Vue({
//     el:'#app4',
//     data:{
//         todos:[
//             {text:'学习 js'},
//             {text:'学习 Vue'},
//             {text:'学习 整个项目'},
//         ]
//     }
// });
// var app5 = new Vue({
//     el:'#app5',
//     data:{
//         message:'Hello Vue.js!'
//     },
//     methods:{
//         reverseMessage:function(){
//             this.message = this.message.split('').reverse().join('')
//         }
//     }
// });
//
// var app6 = new Vue({
//     el:'#app6',
//     data:{
//         message:'Hello Vue!'
//     }
// });
// Vue.component('todo-item',{
//     props:['todo'],
//     template:'<li>{{todo.text}}</li>'
// });
// var app7 = new Vue({
//     el:'#app7',
//     data:{
//         groceryList:[
//             {text:'蔬菜'},
//             {text:'奶酪'},
//             {text:'面包'}
//         ]
//     }
// });
// var data1 = {a:1};
// var vm = new Vue({
//     el:'#example',
//     data:data1
// })
// var appTest = new Vue({
//     el:'#appTest',
//     data:{
//         msg:'Vue hello！'
//     }
// });
// new Vue({
//     el:'#dynamicId',
//     data:{
//         /*dynamicId: false,*/
//         someDynamicCondition: false
//     }
// })