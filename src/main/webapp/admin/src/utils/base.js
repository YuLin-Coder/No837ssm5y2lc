const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm5y2lc/",
            name: "ssm5y2lc",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm5y2lc/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "职工健康每日申报系统"
        } 
    }
}
export default base
