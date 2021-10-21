using Microsoft.VisualStudio.TestTools.UnitTesting;
using Puissance4;

namespace Puissance4Test
{
    [TestClass]
    public class Connect4Test
    {
        // Cas de test usuel
        [TestMethod]
        public void Initialization()
        {
            // Arrange

            // Act
            var test = new Connect4();

            // Assert
            Assert.AreEqual(6, test.LineCount);
            Assert.AreEqual(7, test.ColCount);
            Assert.IsFalse(test.Ended);
            Assert.AreEqual(' ', test.GetPawn(0, 0));
            Assert.AreEqual(' ', test.GetPawn(6, 5));
        }

        [TestMethod]
        public void PlayFirstPawn()
        {
            // Arrange
            var test = new Connect4();

            // Act
            test.Play(3);

            // Assert
            Assert.IsFalse(test.Ended);
            Assert.AreEqual(' ', test.GetPawn(0, 0));
            Assert.AreEqual('X', test.GetPawn(col: 2, line: 5));
        }
        [TestMethod]
        public void PlaySecondPlayer()
        {
            // Arrange
            var test = new Connect4();

            test.Play(3);

            // Act
            test.Play(3);

            // Assert
            Assert.IsFalse(test.Ended);
            Assert.AreEqual('X', test.GetPawn(col: 2, line: 5));
            Assert.AreEqual('O', test.GetPawn(col: 2, line: 4));
        }

        [TestMethod]
        public void PlayFirstColumn()
        {

        }
        [TestMethod]
        public void PlayLastColumn()
        {

        }
        [TestMethod]
        public void PlayInvalidColumn()
        {

        }
        [TestMethod]
        public void PlayWithVerticalWinPlayerX()
        {

        }
        [TestMethod]
        public void PlayWithHorizontalWinPlayerOEndOfLine()
        {
        }
        [TestMethod]
        public void PlayWithHorizontalWinPlayerXMiddleOfLine()
        {
        }
        [TestMethod]
        public void PlayWithWinDiagonalNorthEastPlayerX()
        {
        }
        [TestMethod]
        public void PlayWithWinDiagonalSouthEastPlayerX()
        {
        }
        [TestMethod]
        public void PlayWithDraw()
        {
        }

    }
}
