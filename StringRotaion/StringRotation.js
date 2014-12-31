/**
 * Created by ken on 12/29/14.
 */
function stringRotation(str1, str2){
    if(str1.length == str2.length){
        if(str1.concat(str1).indexOf(str2) > 0){
            return true;
        }
    }
    return false;
}

console.log(stringRotation("california", "niacalifor"));