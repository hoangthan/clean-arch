package com.brkr.cleanArch.utils.extension

fun String.normalizeString(): String {
    this.replace("à|á|ạ|ả|ã|â|ầ|ấ|ậ|ẩ|ẫ|ă|ằ|ắ|ặ|ẳ|ẵ", "a")
    this.replace("è|é|ẹ|ẻ|ẽ|ê|ề|ế|ệ|ể|ễ", "e")
    this.replace("ì|í|ị|ỉ|ĩ", "i")
    this.replace("ò|ó|ọ|ỏ|õ|ô|ồ|ố|ộ|ổ|ỗ|ơ|ờ|ớ|ợ|ở|ỡ", "o")
    this.replace("ù|ú|ụ|ủ|ũ|ư|ừ|ứ|ự|ử|ữ", "u")
    this.replace("ỳ|ý|ỵ|ỷ|ỹ", "y")
    this.replace("đ", "d")

    this.replace("À|Á|Ạ|Ả|Ã|Â|Ầ|Ấ|Ậ|Ẩ|Ẫ|Ă|Ằ|Ắ|Ặ|Ẳ|Ẵ", "A")
    this.replace("È|É|Ẹ|Ẻ|Ẽ|Ê|Ề|Ế|Ệ|Ể|Ễ", "E")
    this.replace("Ì|Í|Ị|Ỉ|Ĩ", "I")
    this.replace("Ò|Ó|Ọ|Ỏ|Õ|Ô|Ồ|Ố|Ộ|Ổ|Ỗ|Ơ|Ờ|Ớ|Ợ|Ở|Ỡ", "O")
    this.replace("Ù|Ú|Ụ|Ủ|Ũ|Ư|Ừ|Ứ|Ự|Ử|Ữ", "U")
    this.replace("Ỳ|Ý|Ỵ|Ỷ|Ỹ", "Y")
    this.replace("Đ", "D")
    return this
}