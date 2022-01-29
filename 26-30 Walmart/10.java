class Solution {
    constructor(radius, x_center, y_center) {
        this.RAD = radius
        this.XC = x_center
        this.YC = y_center
    }
    randPoint() {
        let ang = Math.random() * 2 * Math.PI,
            hyp = Math.sqrt(Math.random()) * this.RAD,
            adj = Math.cos(ang) * hyp,
            opp = Math.sin(ang) * hyp
        return [this.XC + adj, this.YC + opp]
    }
};
