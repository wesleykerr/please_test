# This says that all targets in this package that don't specify otherwise
# will be visible to the whole repo.
# This is often useful for third-party packages like this where we expect
# anyone to use them.
package(default_visibility = ["PUBLIC"])

# This fetches new build rules from an external source.
# In this case maven_jars, which we use below to fetch all transitive dependencies
# of a Maven package.
subinclude("@pleasings//java:maven_jars")

# This is temporarily necessary to work around a small bug.
package(maven_tool = "@pleasings//java/maven")

maven_jars(
    name = "mapdb",
    id = "org.mapdb:mapdb:3.0.8",
)
