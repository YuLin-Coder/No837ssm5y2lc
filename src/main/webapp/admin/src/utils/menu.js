const menu = {
    list() {
        return [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"员工","menuJump":"列表","tableName":"yuangong"}],"menu":"员工管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"健康登记","menuJump":"列表","tableName":"jiankangdengji"}],"menu":"健康登记管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"省份","menuJump":"列表","tableName":"shengfen"}],"menu":"省份管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"市区","menuJump":"列表","tableName":"shiqu"}],"menu":"市区管理"}],"frontMenu":[],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改"],"menu":"健康登记","menuJump":"列表","tableName":"jiankangdengji"}],"menu":"健康登记管理"}],"frontMenu":[],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"员工","tableName":"yuangong"}]
    }
}
export default menu;
