package typings.three.three.geometries

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
import org.scalajs.dom.raw.{WebGLShader, WebGLFramebuffer}
import org.scalajs.dom.experimental.gamepad.*
import scalajs.js.typedarray.*

import typings.three.three.*
import typings.three.three.helpers.*
import typings.three.three.textures.*
import typings.three.three.objects.*
import typings.three.three.extras.*
import typings.three.three.extras.core.*
import typings.three.three.extras.curves.*
import typings.three.three.extras.objects.*
import typings.three.three.animation.*
import typings.three.three.animation.tracks.*
import typings.three.three.loaders.*
import typings.three.three.cameras.*
import typings.three.three.core.*
import typings.three.three.materials.*
import typings.three.three.renderers.*
import typings.three.three.renderers.webxr.*
import typings.three.three.renderers.shaders.*
import typings.three.three.renderers.webgl.*
import typings.three.three.scenes.*
import typings.three.three.math.*
import typings.three.three.math.interpolants.*
import typings.three.three.audio.*
import typings.three.three.lights.*


@js.native
@JSGlobal("THREE.RingGeometry")
class RingGeometry extends BufferGeometry:
	def this(innerRadius: js.UndefOr[Double], outerRadius: js.UndefOr[Double], thetaSegments: js.UndefOr[Double], phiSegments: js.UndefOr[Double], thetaStart: js.UndefOr[Double], thetaLength: js.UndefOr[Double]) = this()

	var parameters: objectType71 = js.native;


@js.native
@JSGlobal("THREE.RingGeometry")
object RingGeometry extends js.Object:
	def fromJSON(data: js.Any): RingGeometry = js.native

@js.native
@JSGlobal("THREE.WireframeGeometry")
class WireframeGeometry extends BufferGeometry:
	def this(geometry: BufferGeometry) = this()


@js.native
@JSGlobal("THREE.IcosahedronGeometry")
class IcosahedronGeometry extends PolyhedronGeometry:
	def this(radius: js.UndefOr[Double], detail: js.UndefOr[Double]) = this()



@js.native
@JSGlobal("THREE.IcosahedronGeometry")
object IcosahedronGeometry extends js.Object:
	def fromJSON(data: js.Any): IcosahedronGeometry = js.native

@js.native
@JSGlobal("THREE.CylinderGeometry")
class CylinderGeometry extends BufferGeometry:
	def this(radiusTop: js.UndefOr[Double], radiusBottom: js.UndefOr[Double], height: js.UndefOr[Double], radialSegments: js.UndefOr[Double], heightSegments: js.UndefOr[Double], openEnded: js.UndefOr[Boolean], thetaStart: js.UndefOr[Double], thetaLength: js.UndefOr[Double]) = this()

	var parameters: objectType72 = js.native;


@js.native
@JSGlobal("THREE.CylinderGeometry")
object CylinderGeometry extends js.Object:
	def fromJSON(data: js.Any): CylinderGeometry = js.native

@js.native
sealed trait ExtrudeGeometryOptions extends js.Object:
	var curveSegments: js.UndefOr[Double] = js.native;
	var steps: js.UndefOr[Double] = js.native;
	var depth: js.UndefOr[Double] = js.native;
	var bevelEnabled: js.UndefOr[Boolean] = js.native;
	var bevelThickness: js.UndefOr[Double] = js.native;
	var bevelSize: js.UndefOr[Double] = js.native;
	var bevelOffset: js.UndefOr[Double] = js.native;
	var bevelSegments: js.UndefOr[Double] = js.native;
	var extrudePath: js.UndefOr[Curve[Vector3]] = js.native;
	var UVGenerator: js.UndefOr[UVGenerator] = js.native;

@js.native
sealed trait UVGenerator extends js.Object:
	def generateTopUV(geometry: ExtrudeGeometry, vertices: js.Array[Double], indexA: Double, indexB: Double, indexC: Double): js.Array[Vector2] = js.native
	def generateSideWallUV(geometry: ExtrudeGeometry, vertices: js.Array[Double], indexA: Double, indexB: Double, indexC: Double, indexD: Double): js.Array[Vector2] = js.native

@js.native
@JSGlobal("THREE.ExtrudeGeometry")
class ExtrudeGeometry extends BufferGeometry:
	def this(shapes: Shape | js.Array[Shape], options: js.UndefOr[ExtrudeGeometryOptions]) = this()

	def addShapeList(shapes: js.Array[Shape], options: js.UndefOr[js.Any]): Unit = js.native
	def addShape(shape: Shape, options: js.UndefOr[js.Any]): Unit = js.native


@js.native
@JSGlobal("THREE.ExtrudeGeometry")
object ExtrudeGeometry extends js.Object:
	def fromJSON(data: js.Any): ExtrudeGeometry = js.native

@js.native
@JSGlobal("THREE.OctahedronGeometry")
class OctahedronGeometry extends PolyhedronGeometry:
	def this(radius: js.UndefOr[Double], detail: js.UndefOr[Double]) = this()



@js.native
@JSGlobal("THREE.OctahedronGeometry")
object OctahedronGeometry extends js.Object:
	def fromJSON(data: js.Any): OctahedronGeometry = js.native

@js.native
@JSGlobal("THREE.ShapeGeometry")
class ShapeGeometry extends BufferGeometry:
	def this(shapes: Shape | js.Array[Shape], curveSegments: js.UndefOr[Double]) = this()



@js.native
@JSGlobal("THREE.ShapeGeometry")
object ShapeGeometry extends js.Object:
	def fromJSON(data: js.Any): ShapeGeometry = js.native

@js.native
@JSGlobal("THREE.ParametricGeometry")
class ParametricGeometry extends BufferGeometry:
	def this(func: js.Function3[Double,Double,Vector3,Unit], slices: Double, stacks: Double) = this()

	var parameters: objectType73 = js.native;

@js.native
@JSGlobal("THREE.DodecahedronGeometry")
class DodecahedronGeometry extends PolyhedronGeometry:
	def this(radius: js.UndefOr[Double], detail: js.UndefOr[Double]) = this()



@js.native
@JSGlobal("THREE.DodecahedronGeometry")
object DodecahedronGeometry extends js.Object:
	def fromJSON(data: js.Any): DodecahedronGeometry = js.native

@js.native
@JSGlobal("THREE.TorusKnotGeometry")
class TorusKnotGeometry extends BufferGeometry:
	def this(radius: js.UndefOr[Double], tube: js.UndefOr[Double], tubularSegments: js.UndefOr[Double], radialSegments: js.UndefOr[Double], p: js.UndefOr[Double], q: js.UndefOr[Double]) = this()

	var parameters: objectType74 = js.native;


@js.native
@JSGlobal("THREE.TorusKnotGeometry")
object TorusKnotGeometry extends js.Object:
	def fromJSON(data: js.Any): TorusKnotGeometry = js.native

@js.native
@JSGlobal("THREE.PlaneGeometry")
class PlaneGeometry extends BufferGeometry:
	def this(width: js.UndefOr[Double], height: js.UndefOr[Double], widthSegments: js.UndefOr[Double], heightSegments: js.UndefOr[Double]) = this()

	var parameters: objectType75 = js.native;


@js.native
@JSGlobal("THREE.PlaneGeometry")
object PlaneGeometry extends js.Object:
	def fromJSON(data: js.Any): PlaneGeometry = js.native

@js.native
@JSGlobal("THREE.BoxGeometry")
class BoxGeometry extends BufferGeometry:
	def this(width: js.UndefOr[Double], height: js.UndefOr[Double], depth: js.UndefOr[Double], widthSegments: js.UndefOr[Double], heightSegments: js.UndefOr[Double], depthSegments: js.UndefOr[Double]) = this()

	var parameters: objectType76 = js.native;


@js.native
@JSGlobal("THREE.BoxGeometry")
object BoxGeometry extends js.Object:
	def fromJSON(data: js.Any): BoxGeometry = js.native

@js.native
@JSGlobal("THREE.SphereGeometry")
class SphereGeometry extends BufferGeometry:
	def this(radius: js.UndefOr[Double], widthSegments: js.UndefOr[Double], heightSegments: js.UndefOr[Double], phiStart: js.UndefOr[Double], phiLength: js.UndefOr[Double], thetaStart: js.UndefOr[Double], thetaLength: js.UndefOr[Double]) = this()

	var parameters: objectType77 = js.native;


@js.native
@JSGlobal("THREE.SphereGeometry")
object SphereGeometry extends js.Object:
	def fromJSON(data: js.Any): SphereGeometry = js.native

@js.native
@JSGlobal("THREE.EdgesGeometry")
class EdgesGeometry extends BufferGeometry:
	def this(geometry: BufferGeometry, thresholdAngle: js.UndefOr[Double]) = this()

	var parameters: objectType78 = js.native;

@js.native
@JSGlobal("THREE.ConeGeometry")
class ConeGeometry extends CylinderGeometry:
	def this(radius: js.UndefOr[Double], height: js.UndefOr[Double], radialSegments: js.UndefOr[Double], heightSegments: js.UndefOr[Double], openEnded: js.UndefOr[Boolean], thetaStart: js.UndefOr[Double], thetaLength: js.UndefOr[Double]) = this()



@js.native
@JSGlobal("THREE.ConeGeometry")
object ConeGeometry extends js.Object:
	def fromJSON(data: js.Any): ConeGeometry = js.native

@js.native
@JSGlobal("THREE.CircleGeometry")
class CircleGeometry extends BufferGeometry:
	def this(radius: js.UndefOr[Double], segments: js.UndefOr[Double], thetaStart: js.UndefOr[Double], thetaLength: js.UndefOr[Double]) = this()

	var parameters: objectType79 = js.native;


@js.native
@JSGlobal("THREE.CircleGeometry")
object CircleGeometry extends js.Object:
	def fromJSON(data: js.Any): CircleGeometry = js.native

@js.native
@JSGlobal("THREE.PolyhedronGeometry")
class PolyhedronGeometry extends BufferGeometry:
	def this(vertices: js.Array[Double], indices: js.Array[Double], radius: js.UndefOr[Double], detail: js.UndefOr[Double]) = this()

	var parameters: objectType80 = js.native;


@js.native
@JSGlobal("THREE.PolyhedronGeometry")
object PolyhedronGeometry extends js.Object:
	def fromJSON(data: js.Any): PolyhedronGeometry = js.native

@js.native
@JSGlobal("THREE.LatheGeometry")
class LatheGeometry extends BufferGeometry:
	def this(points: js.Array[Vector2], segments: js.UndefOr[Double], phiStart: js.UndefOr[Double], phiLength: js.UndefOr[Double]) = this()

	var parameters: objectType81 = js.native;


@js.native
@JSGlobal("THREE.LatheGeometry")
object LatheGeometry extends js.Object:
	def fromJSON(data: js.Any): LatheGeometry = js.native

@js.native
sealed trait TextGeometryParameters extends js.Object:
	var font: Font = js.native;
	var size: js.UndefOr[Double] = js.native;
	var height: js.UndefOr[Double] = js.native;
	var curveSegments: js.UndefOr[Double] = js.native;
	var bevelEnabled: js.UndefOr[Boolean] = js.native;
	var bevelThickness: js.UndefOr[Double] = js.native;
	var bevelSize: js.UndefOr[Double] = js.native;
	var bevelOffset: js.UndefOr[Double] = js.native;
	var bevelSegments: js.UndefOr[Double] = js.native;

@js.native
@JSGlobal("THREE.TextGeometry")
class TextGeometry extends ExtrudeGeometry:
	def this(text: String, parameters: TextGeometryParameters) = this()

	var parameters: objectType82 = js.native;

@js.native
@JSGlobal("THREE.TorusGeometry")
class TorusGeometry extends BufferGeometry:
	def this(radius: js.UndefOr[Double], tube: js.UndefOr[Double], radialSegments: js.UndefOr[Double], tubularSegments: js.UndefOr[Double], arc: js.UndefOr[Double]) = this()

	var parameters: objectType83 = js.native;


@js.native
@JSGlobal("THREE.TorusGeometry")
object TorusGeometry extends js.Object:
	def fromJSON(data: js.Any): TorusGeometry = js.native

@js.native
@JSGlobal("THREE.TetrahedronGeometry")
class TetrahedronGeometry extends PolyhedronGeometry:
	def this(radius: js.UndefOr[Double], detail: js.UndefOr[Double]) = this()



@js.native
@JSGlobal("THREE.TetrahedronGeometry")
object TetrahedronGeometry extends js.Object:
	def fromJSON(data: js.Any): TetrahedronGeometry = js.native

@js.native
@JSGlobal("THREE.TubeGeometry")
class TubeGeometry extends BufferGeometry:
	def this(path: Curve[Vector3], tubularSegments: js.UndefOr[Double], radius: js.UndefOr[Double], radiusSegments: js.UndefOr[Double], closed: js.UndefOr[Boolean]) = this()

	var parameters: objectType84 = js.native;
	var tangents: js.Array[Vector3] = js.native;
	var normals: js.Array[Vector3] = js.native;
	var binormals: js.Array[Vector3] = js.native;


@js.native
@JSGlobal("THREE.TubeGeometry")
object TubeGeometry extends js.Object:
	def fromJSON(data: js.Any): TubeGeometry = js.native

@js.native
sealed trait objectType75 extends js.Object:
	var width: Double = js.native;
	var height: Double = js.native;
	var widthSegments: Double = js.native;
	var heightSegments: Double = js.native;

@js.native
sealed trait objectType64 extends js.Object:
	var value: js.Array[js.Any] = js.native;
	var properties: objectType85 = js.native;

@js.native
sealed trait objectType71 extends js.Object:
	var innerRadius: Double = js.native;
	var outerRadius: Double = js.native;
	var thetaSegments: Double = js.native;
	var phiSegments: Double = js.native;
	var thetaStart: Double = js.native;
	var thetaLength: Double = js.native;

@js.native
sealed trait objectType68 extends js.Object:
	var value: js.Array[js.Any] = js.native;
	var properties: objectType86 = js.native;

@js.native
sealed trait objectType76 extends js.Object:
	var width: Double = js.native;
	var height: Double = js.native;
	var depth: Double = js.native;
	var widthSegments: Double = js.native;
	var heightSegments: Double = js.native;
	var depthSegments: Double = js.native;

@js.native
sealed trait objectType74 extends js.Object:
	var radius: Double = js.native;
	var tube: Double = js.native;
	var tubularSegments: Double = js.native;
	var radialSegments: Double = js.native;
	var p: Double = js.native;
	var q: Double = js.native;

@js.native
sealed trait objectType83 extends js.Object:
	var radius: Double = js.native;
	var tube: Double = js.native;
	var radialSegments: Double = js.native;
	var tubularSegments: Double = js.native;
	var arc: Double = js.native;

@js.native
sealed trait objectType70 extends js.Object:
	var directionalLength: Double = js.native;
	var pointLength: Double = js.native;
	var spotLength: Double = js.native;
	var rectAreaLength: Double = js.native;
	var hemiLength: Double = js.native;
	var numDirectionalShadows: Double = js.native;
	var numPointShadows: Double = js.native;
	var numSpotShadows: Double = js.native;

@js.native
sealed trait objectType69 extends js.Object:
	var value: js.Array[js.Any] = js.native;
	var properties: objectType87 = js.native;

@js.native
sealed trait objectType72 extends js.Object:
	var radiusTop: Double = js.native;
	var radiusBottom: Double = js.native;
	var height: Double = js.native;
	var radialSegments: Double = js.native;
	var heightSegments: Double = js.native;
	var openEnded: Boolean = js.native;
	var thetaStart: Double = js.native;
	var thetaLength: Double = js.native;

@js.native
sealed trait objectType78 extends js.Object:
	var thresholdAngle: Double = js.native;

@js.native
sealed trait objectType73 extends js.Object:
	var func: js.Function3[Double,Double,Vector3,Unit] = js.native;
	var slices: Double = js.native;
	var stacks: Double = js.native;

@js.native
sealed trait objectType65 extends js.Object:
	var value: js.Array[js.Any] = js.native;
	var properties: objectType88 = js.native;

@js.native
sealed trait objectType80 extends js.Object:
	var vertices: js.Array[Double] = js.native;
	var indices: js.Array[Double] = js.native;
	var radius: Double = js.native;
	var detail: Double = js.native;

@js.native
sealed trait objectType67 extends js.Object:
	var value: js.Array[js.Any] = js.native;
	var properties: objectType89 = js.native;

@js.native
sealed trait objectType84 extends js.Object:
	var path: Curve[Vector3] = js.native;
	var tubularSegments: Double = js.native;
	var radius: Double = js.native;
	var radialSegments: Double = js.native;
	var closed: Boolean = js.native;

@js.native
sealed trait objectType79 extends js.Object:
	var radius: Double = js.native;
	var segments: Double = js.native;
	var thetaStart: Double = js.native;
	var thetaLength: Double = js.native;

@js.native
sealed trait objectType66 extends js.Object:
	var value: js.Array[js.Any] = js.native;
	var properties: objectType90 = js.native;

@js.native
sealed trait objectType81 extends js.Object:
	var points: js.Array[Vector2] = js.native;
	var segments: Double = js.native;
	var phiStart: Double = js.native;
	var phiLength: Double = js.native;

@js.native
sealed trait objectType82 extends js.Object:
	var font: Font = js.native;
	var size: Double = js.native;
	var height: Double = js.native;
	var curveSegments: Double = js.native;
	var bevelEnabled: Boolean = js.native;
	var bevelThickness: Double = js.native;
	var bevelSize: Double = js.native;
	var bevelOffset: Double = js.native;
	var bevelSegments: Double = js.native;

@js.native
sealed trait objectType77 extends js.Object:
	var radius: Double = js.native;
	var widthSegments: Double = js.native;
	var heightSegments: Double = js.native;
	var phiStart: Double = js.native;
	var phiLength: Double = js.native;
	var thetaStart: Double = js.native;
	var thetaLength: Double = js.native;
