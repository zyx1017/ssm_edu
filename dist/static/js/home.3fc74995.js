(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["home"],{"0ecd":function(t,e,s){"use strict";var a=s("217e"),l=s.n(a);l.a},"217e":function(t,e,s){},fc88:function(t,e,s){"use strict";s.r(e);var a=function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("section",{staticClass:"courses"},[s("el-form",{staticClass:"actions",attrs:{inline:!0,model:t.filter}},[s("el-form-item",{staticClass:"input-title",attrs:{label:"课程名称"}},[s("el-input",{attrs:{type:"search",placeholder:"课程名称"},model:{value:t.filter.courseName,callback:function(e){t.$set(t.filter,"courseName",e)},expression:"filter.courseName"}})],1),s("el-form-item",{attrs:{label:"状态"}},[s("el-select",{attrs:{placeholder:"课程状态"},model:{value:t.filter.status,callback:function(e){t.$set(t.filter,"status",e)},expression:"filter.status"}},[s("el-option",{attrs:{label:"全部",value:""}}),s("el-option",{attrs:{label:"上架",value:"1"}}),s("el-option",{attrs:{label:"下架",value:"0"}})],1)],1),s("el-form-item",[s("el-button",{on:{click:t.handleFilter}},[t._v("查询")])],1),s("el-form-item",{staticClass:"btn-add"},[s("el-button",{attrs:{type:"primary",icon:"el-icon-plus"},on:{click:t.handleAdd}},[t._v("新建课程")])],1)],1),s("el-table",{directives:[{name:"loading",rawName:"v-loading",value:t.loading,expression:"loading"}],attrs:{data:t.courses,"element-loading-text":"数据加载中..."}},[s("el-table-column",{attrs:{prop:"id",label:"ID",width:"50"}}),s("el-table-column",{attrs:{prop:"courseName",label:"课程名称"}}),s("el-table-column",{attrs:{prop:"price",label:"价格",align:"center","min-width":"140",formatter:t.priceFormatter}}),s("el-table-column",{attrs:{prop:"sortNum",label:"排序",align:"center","min-width":"100"}}),s("el-table-column",{attrs:{prop:"status",label:"状态",align:"center","min-width":"120"},scopedSlots:t._u([{key:"default",fn:function(e){return[1===e.row.status?s("i",{staticClass:"status status-success",attrs:{title:"上架"}}):0===e.row.status?s("i",{staticClass:"status status-danger",attrs:{title:"下架"}}):t._e()]}}])}),s("el-table-column",{attrs:{label:"操作",align:"center",width:"260"},scopedSlots:t._u([{key:"default",fn:function(e){return[1===e.row.status?s("el-button",{attrs:{size:"mini",type:"danger"},on:{click:function(s){return t.handleToggleStatus(e.row)}}},[t._v("下架")]):0===e.row.status?s("el-button",{attrs:{size:"mini",type:"success"},on:{click:function(s){return t.handleToggleStatus(e.row)}}},[t._v("上架")]):t._e(),s("el-button",{attrs:{size:"mini"},on:{click:function(s){return t.handleNavigate("CourseItem",e.row.id)}}},[t._v("编辑")]),s("el-button",{attrs:{size:"mini"},on:{click:function(s){return t.handleNavigate("CourseSections",e.row.id)}}},[t._v("内容管理")])]}}])})],1)],1)},l=[],n=(s("4de4"),s("ed08")),r={name:"Courses",title:"课程管理",data:function(){var t={courseName:"",status:""};return{filter:t,courses:[],loading:!1}},created:function(){this.loadCourses()},methods:{loadCourses:function(){var t=this;this.loading=!0;var e={};return this.filter.courseName&&(e.courseName=this.filter.courseName),this.filter.status&&(e.status=this.filter.status),n["b"].post("/course/findAllCourse",e).then((function(e){t.courses=e.data.content,t.loading=!1})).catch((function(e){t.$message.error("数据获取失败! ! !")}))},handleFilter:function(){this.loadCourses()},handleAdd:function(){this.$router.push({name:"CourseItem",params:{courseId:"new"}})},handleToggleStatus:function(t){var e=this,s=1-t.status;n["b"].get("/course/updateCourseStatus",{params:{status:s,id:t.id}}).then((function(e){t.status=s,console.log(t),window.location.reload})).catch((function(t){e.$message.error("状态修改失败! ! !")}))},handleNavigate:function(t,e){this.$router.push({name:t,params:{courseId:e}})},priceFormatter:function(t,e,s,a){return"¥".concat(s)}}},o=r,i=(s("0ecd"),s("2877")),u=Object(i["a"])(o,a,l,!1,null,null,null);e["default"]=u.exports}}]);