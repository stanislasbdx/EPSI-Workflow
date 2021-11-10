using Microsoft.VisualStudio.TestTools.UnitTesting;
using ConsoleRomain2;

namespace TestConsoleRomain2
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestParse_III()
        {
			Assert.AreEqual(3, ConsoleRomain2.Program.ParseRomanNumber("III"));
		}

		[TestMethod]
		public void TestParse_IV()
		{
			Assert.AreEqual(4, ConsoleRomain2.Program.ParseRomanNumber("IV"));
		}

		[TestMethod]
		public void TestParse_VIV()
		{
			Assert.AreEqual(3, ConsoleRomain2.Program.ParseRomanNumber("III"));
		}
    }
}
