/**
 * Created by hylke on 04/12/14.
 */
var fs = require('fs')
myCode = fs.readFileSync('src/example.js', 'utf-8') // depends on the file encoding
eval(myCode)

describe("Validate word length", function () {

    it("default state undefined", function () {
        expect(isShortWord(undefined)).toBe(false);
    })

    it("short word", function () {
        expect(isShortWord("ab")).toBe(true);
    });

});