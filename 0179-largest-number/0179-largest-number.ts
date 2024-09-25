function largestNumber(nums: number[]): string {
    let str_list = nums.map(num => "" + num);
    str_list.sort((a,b)=> {
        if (a + b > b + a) return -1
        else return 1
    });
    return str_list.join("").charAt(0) == '0'? "0":str_list.join("")
};