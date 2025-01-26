const base = {
    get() {
        return {
            url : "http://localhost:8080/bianjiewaimai/",
            name: "bianjiewaimai",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/bianjiewaimai/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "便捷外卖点餐系统"
        } 
    }
}
export default base
