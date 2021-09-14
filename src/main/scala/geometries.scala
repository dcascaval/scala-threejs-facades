package typings.three

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import scalajs.js.typedarray.*

@js.native
JSGlobal("THREE")
object geometries extends js.Object:
	@js.native
	class RingGeometry extends js.Object:
		val type: String = js.native;
		val parameters: objectType3 = js.native;

	@js.native
	class WireframeGeometry extends js.Object:
		val type: String = js.native;
	@js.native
	class IcosahedronGeometry extends js.Object:
		val type: String = js.native;

	@js.native
	class CylinderGeometry extends js.Object:
		val type: String = js.native;
		val parameters: objectType4 = js.native;

	@js.nativetrait ExtrudeGeometryOptions extends js.Object:
		val curveSegments: js.UndefOr[js.UndefOr[Double]] = js.native;
		val steps: js.UndefOr[js.UndefOr[Double]] = js.native;
		val depth: js.UndefOr[js.UndefOr[Double]] = js.native;
		val bevelEnabled: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val bevelThickness: js.UndefOr[js.UndefOr[Double]] = js.native;
		val bevelSize: js.UndefOr[js.UndefOr[Double]] = js.native;
		val bevelOffset: js.UndefOr[js.UndefOr[Double]] = js.native;
		val bevelSegments: js.UndefOr[js.UndefOr[Double]] = js.native;
		val extrudePath: js.UndefOr[js.UndefOr[Curve[Vector3]]] = js.native;
		val UVGenerator: js.UndefOr[js.UndefOr[UVGenerator]] = js.native;
	@js.nativetrait UVGenerator extends js.Object:
		def generateTopUV(geometry: ExtrudeGeometry, vertices: js.Array[Double], indexA: Double, indexB: Double, indexC: Double): js.Array[Vector2] = js.native
		def generateSideWallUV(geometry: ExtrudeGeometry, vertices: js.Array[Double], indexA: Double, indexB: Double, indexC: Double, indexD: Double): js.Array[Vector2] = js.native
	@js.native
	class ExtrudeGeometry extends js.Object:
		val type: String = js.native;
		def addShapeList(shapes: js.Array[Shape], options: js.UndefOr[js.Any] = js.undefined): Unit = js.native
		def addShape(shape: Shape, options: js.UndefOr[js.Any] = js.undefined): Unit = js.native

	@js.native
	class OctahedronGeometry extends js.Object:
		val type: String = js.native;

	@js.native
	class ShapeGeometry extends js.Object:
		val type: String = js.native;

	@js.native
	class ParametricGeometry extends js.Object:
		val type: String = js.native;
		val parameters: objectType5 = js.native;
	@js.native
	class DodecahedronGeometry extends js.Object:
		val type: String = js.native;

	@js.native
	class TorusKnotGeometry extends js.Object:
		val type: String = js.native;
		val parameters: objectType6 = js.native;

	@js.native
	class PlaneGeometry extends js.Object:
		val type: String = js.native;
		val parameters: objectType7 = js.native;

	@js.native
	class BoxGeometry extends js.Object:
		val type: String = js.native;
		val parameters: objectType8 = js.native;

	@js.native
	class SphereGeometry extends js.Object:
		val type: String = js.native;
		val parameters: objectType9 = js.native;

	@js.native
	class EdgesGeometry extends js.Object:
		val type: String = js.native;
		val parameters: objectType10 = js.native;
	@js.native
	class ConeGeometry extends js.Object:
		val type: String = js.native;

	@js.native
	class CircleGeometry extends js.Object:
		val type: String = js.native;
		val parameters: objectType11 = js.native;

	@js.native
	class PolyhedronGeometry extends js.Object:
		val type: String = js.native;
		val parameters: objectType12 = js.native;

	@js.native
	class LatheGeometry extends js.Object:
		val type: String = js.native;
		val parameters: objectType13 = js.native;

	@js.nativetrait TextGeometryParameters extends js.Object:
		val font: Font = js.native;
		val size: js.UndefOr[js.UndefOr[Double]] = js.native;
		val height: js.UndefOr[js.UndefOr[Double]] = js.native;
		val curveSegments: js.UndefOr[js.UndefOr[Double]] = js.native;
		val bevelEnabled: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val bevelThickness: js.UndefOr[js.UndefOr[Double]] = js.native;
		val bevelSize: js.UndefOr[js.UndefOr[Double]] = js.native;
		val bevelOffset: js.UndefOr[js.UndefOr[Double]] = js.native;
		val bevelSegments: js.UndefOr[js.UndefOr[Double]] = js.native;
	@js.native
	class TextGeometry extends js.Object:
		val type: String = js.native;
		val parameters: objectType14 = js.native;
	@js.native
	class TorusGeometry extends js.Object:
		val type: String = js.native;
		val parameters: objectType15 = js.native;

	@js.native
	class TetrahedronGeometry extends js.Object:
		val type: String = js.native;

	@js.native
	class TubeGeometry extends js.Object:
		val type: String = js.native;
		val parameters: objectType16 = js.native;
		val tangents: js.Array[Vector3] = js.native;
		val normals: js.Array[Vector3] = js.native;
		val binormals: js.Array[Vector3] = js.native;

