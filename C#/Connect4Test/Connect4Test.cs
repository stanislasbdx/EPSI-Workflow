using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Connect4Test
{
    [TestClass]
    public class Connect4Test
    {
        [TestMethod]
        public void TestMethod1()
        {
            // Arrange

            // Act
            var test = new Connect4();

            // Assert
            Assert.AreEqual(6, test.LineCount);
			Assert.AreEqual(4, test.ColCount);
			Assert.IsFalse(test.ended);
        }
    }
}
