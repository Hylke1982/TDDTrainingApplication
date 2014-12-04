/**
 * Created by hylke on 04/12/14.
 */

describe("Validate word length", function () {

    it("default state undefined", function () {
        obj.setState("dirty");
        expect(isShortWord(undefined)).toBe(false);
    })

    it("short word", function () {
        obj.setState("ab");
        expect(isShortWord(undefined)).toBe(true);
    });

});
