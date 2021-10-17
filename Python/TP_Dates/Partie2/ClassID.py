from ClassDate import *

class ID(Date):

	def __init__(self, id, firstName, lastName, signupDate):

		self.id = id
		self.firstName = firstName
		self.lastName = lastName
		self.signupDate = signupDate

	def getFullName(self):
		return (self.firstName + self.lastName).upper()