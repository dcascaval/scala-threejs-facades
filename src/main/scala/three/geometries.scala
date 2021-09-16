package typings.three.geometries

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLElement, HTMLDocument, HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
import org.scalajs.dom.raw.{WebGLShader, WebGLFramebuffer}
import org.scalajs.dom.experimental.gamepad.*
import scalajs.js.typedarray.*

import typings.three.*
import typings.three.helpers.*
import typings.three.textures.*
import typings.three.objects.*
import typings.three.extras.*
import typings.three.extras.core.*
import typings.three.extras.curves.*
import typings.three.extras.objects.*
import typings.three.animation.*
import typings.three.animation.tracks.*
import typings.three.loaders.*
import typings.three.cameras.*
import typings.three.core.*
import typings.three.materials.*
import typings.three.renderers.*
import typings.three.renderers.webxr.*
import typings.three.renderers.shaders.*
import typings.three.renderers.webgl.*
import typings.three.scenes.*
import typings.three.math.*
import typings.three.math.interpolants.*
import typings.three.audio.*
import typings.three.lights.*


@js.native
@JSGlobal("THREE.RingGeometry")
class RingGeometry extends BufferGeometry:
	def this(innerRadius: js.UndefOr[Double] = js.undefined, outerRadius: js.UndefOr[Double] = js.undefined, thetaSegments: js.UndefOr[Double] = js.undefined, phiSegments: js.UndefOr[Double] = js.undefined, thetaStart: js.UndefOr[Double] = js.undefined, thetaLength: js.UndefOr[Double] = js.undefined) = this()

	var parameters: AnonObject71 = js.native


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
	def this(radius: js.UndefOr[Double] = js.undefined, detail: js.UndefOr[Double] = js.undefined) = this()



@js.native
@JSGlobal("THREE.IcosahedronGeometry")
object IcosahedronGeometry extends js.Object:
	def fromJSON(data: js.Any): IcosahedronGeometry = js.native

@js.native
@JSGlobal("THREE.CylinderGeometry")
class CylinderGeometry extends BufferGeometry:
	def this(radiusTop: js.UndefOr[Double] = js.undefined, radiusBottom: js.UndefOr[Double] = js.undefined, height: js.UndefOr[Double] = js.undefined, radialSegments: js.UndefOr[Double] = js.undefined, heightSegments: js.UndefOr[Double] = js.undefined, openEnded: js.UndefOr[Boolean] = js.undefined, thetaStart: js.UndefOr[Double] = js.undefined, thetaLength: js.UndefOr[Double] = js.undefined) = this()

	var parameters: AnonObject72 = js.native


@js.native
@JSGlobal("THREE.CylinderGeometry")
object CylinderGeometry extends js.Object:
	def fromJSON(data: js.Any): CylinderGeometry = js.native

@js.native
trait ExtrudeGeometryOptions extends js.Object:
	var curveSegments: js.UndefOr[Double] = js.native
	var steps: js.UndefOr[Double] = js.native
	var depth: js.UndefOr[Double] = js.native
	var bevelEnabled: js.UndefOr[Boolean] = js.native
	var bevelThickness: js.UndefOr[Double] = js.native
	var bevelSize: js.UndefOr[Double] = js.native
	var bevelOffset: js.UndefOr[Double] = js.native
	var bevelSegments: js.UndefOr[Double] = js.native
	var extrudePath: js.UndefOr[Curve[Vector3]] = js.native
	var UVGenerator: js.UndefOr[UVGenerator] = js.native

@js.native
trait UVGenerator extends js.Object:
	def generateTopUV(geometry: ExtrudeGeometry, vertices: js.Array[Double], indexA: Double, indexB: Double, indexC: Double): js.Array[Vector2] = js.native
	def generateSideWallUV(geometry: ExtrudeGeometry, vertices: js.Array[Double], indexA: Double, indexB: Double, indexC: Double, indexD: Double): js.Array[Vector2] = js.native

@js.native
@JSGlobal("THREE.ExtrudeGeometry")
class ExtrudeGeometry extends BufferGeometry:
	def this(shapes: Shape | js.Array[Shape], options: js.UndefOr[ExtrudeGeometryOptions] = js.undefined) = this()

	def addShapeList(shapes: js.Array[Shape], options: js.UndefOr[js.Any] = js.undefined): Unit = js.native
	def addShape(shape: Shape, options: js.UndefOr[js.Any] = js.undefined): Unit = js.native


@js.native
@JSGlobal("THREE.ExtrudeGeometry")
object ExtrudeGeometry extends js.Object:
	def fromJSON(data: js.Any): ExtrudeGeometry = js.native

@js.native
@JSGlobal("THREE.OctahedronGeometry")
class OctahedronGeometry extends PolyhedronGeometry:
	def this(radius: js.UndefOr[Double] = js.undefined, detail: js.UndefOr[Double] = js.undefined) = this()



@js.native
@JSGlobal("THREE.OctahedronGeometry")
object OctahedronGeometry extends js.Object:
	def fromJSON(data: js.Any): OctahedronGeometry = js.native

@js.native
@JSGlobal("THREE.ShapeGeometry")
class ShapeGeometry extends BufferGeometry:
	def this(shapes: Shape | js.Array[Shape], curveSegments: js.UndefOr[Double] = js.undefined) = this()



@js.native
@JSGlobal("THREE.ShapeGeometry")
object ShapeGeometry extends js.Object:
	def fromJSON(data: js.Any): ShapeGeometry = js.native

@js.native
@JSGlobal("THREE.ParametricGeometry")
class ParametricGeometry extends BufferGeometry:
	def this(func: js.Function3[Double,Double,Vector3,Unit], slices: Double, stacks: Double) = this()

	var parameters: AnonObject73 = js.native

@js.native
@JSGlobal("THREE.DodecahedronGeometry")
class DodecahedronGeometry extends PolyhedronGeometry:
	def this(radius: js.UndefOr[Double] = js.undefined, detail: js.UndefOr[Double] = js.undefined) = this()



@js.native
@JSGlobal("THREE.DodecahedronGeometry")
object DodecahedronGeometry extends js.Object:
	def fromJSON(data: js.Any): DodecahedronGeometry = js.native

@js.native
@JSGlobal("THREE.TorusKnotGeometry")
class TorusKnotGeometry extends BufferGeometry:
	def this(radius: js.UndefOr[Double] = js.undefined, tube: js.UndefOr[Double] = js.undefined, tubularSegments: js.UndefOr[Double] = js.undefined, radialSegments: js.UndefOr[Double] = js.undefined, p: js.UndefOr[Double] = js.undefined, q: js.UndefOr[Double] = js.undefined) = this()

	var parameters: AnonObject74 = js.native


@js.native
@JSGlobal("THREE.TorusKnotGeometry")
object TorusKnotGeometry extends js.Object:
	def fromJSON(data: js.Any): TorusKnotGeometry = js.native

@js.native
@JSGlobal("THREE.PlaneGeometry")
class PlaneGeometry extends BufferGeometry:
	def this(width: js.UndefOr[Double] = js.undefined, height: js.UndefOr[Double] = js.undefined, widthSegments: js.UndefOr[Double] = js.undefined, heightSegments: js.UndefOr[Double] = js.undefined) = this()

	var parameters: AnonObject75 = js.native


@js.native
@JSGlobal("THREE.PlaneGeometry")
object PlaneGeometry extends js.Object:
	def fromJSON(data: js.Any): PlaneGeometry = js.native

@js.native
@JSGlobal("THREE.BoxGeometry")
class BoxGeometry extends BufferGeometry:
	def this(width: js.UndefOr[Double] = js.undefined, height: js.UndefOr[Double] = js.undefined, depth: js.UndefOr[Double] = js.undefined, widthSegments: js.UndefOr[Double] = js.undefined, heightSegments: js.UndefOr[Double] = js.undefined, depthSegments: js.UndefOr[Double] = js.undefined) = this()

	var parameters: AnonObject76 = js.native


@js.native
@JSGlobal("THREE.BoxGeometry")
object BoxGeometry extends js.Object:
	def fromJSON(data: js.Any): BoxGeometry = js.native

@js.native
@JSGlobal("THREE.SphereGeometry")
class SphereGeometry extends BufferGeometry:
	def this(radius: js.UndefOr[Double] = js.undefined, widthSegments: js.UndefOr[Double] = js.undefined, heightSegments: js.UndefOr[Double] = js.undefined, phiStart: js.UndefOr[Double] = js.undefined, phiLength: js.UndefOr[Double] = js.undefined, thetaStart: js.UndefOr[Double] = js.undefined, thetaLength: js.UndefOr[Double] = js.undefined) = this()

	var parameters: AnonObject77 = js.native


@js.native
@JSGlobal("THREE.SphereGeometry")
object SphereGeometry extends js.Object:
	def fromJSON(data: js.Any): SphereGeometry = js.native

@js.native
@JSGlobal("THREE.EdgesGeometry")
class EdgesGeometry extends BufferGeometry:
	def this(geometry: BufferGeometry, thresholdAngle: js.UndefOr[Double] = js.undefined) = this()

	var parameters: AnonObject78 = js.native

@js.native
@JSGlobal("THREE.ConeGeometry")
class ConeGeometry extends CylinderGeometry:
	def this(radius: js.UndefOr[Double] = js.undefined, height: js.UndefOr[Double] = js.undefined, radialSegments: js.UndefOr[Double] = js.undefined, heightSegments: js.UndefOr[Double] = js.undefined, openEnded: js.UndefOr[Boolean] = js.undefined, thetaStart: js.UndefOr[Double] = js.undefined, thetaLength: js.UndefOr[Double] = js.undefined) = this()



@js.native
@JSGlobal("THREE.ConeGeometry")
object ConeGeometry extends js.Object:
	def fromJSON(data: js.Any): ConeGeometry = js.native

@js.native
@JSGlobal("THREE.CircleGeometry")
class CircleGeometry extends BufferGeometry:
	def this(radius: js.UndefOr[Double] = js.undefined, segments: js.UndefOr[Double] = js.undefined, thetaStart: js.UndefOr[Double] = js.undefined, thetaLength: js.UndefOr[Double] = js.undefined) = this()

	var parameters: AnonObject79 = js.native


@js.native
@JSGlobal("THREE.CircleGeometry")
object CircleGeometry extends js.Object:
	def fromJSON(data: js.Any): CircleGeometry = js.native

@js.native
@JSGlobal("THREE.PolyhedronGeometry")
class PolyhedronGeometry extends BufferGeometry:
	def this(vertices: js.Array[Double], indices: js.Array[Double], radius: js.UndefOr[Double] = js.undefined, detail: js.UndefOr[Double] = js.undefined) = this()

	var parameters: AnonObject80 = js.native


@js.native
@JSGlobal("THREE.PolyhedronGeometry")
object PolyhedronGeometry extends js.Object:
	def fromJSON(data: js.Any): PolyhedronGeometry = js.native

@js.native
@JSGlobal("THREE.LatheGeometry")
class LatheGeometry extends BufferGeometry:
	def this(points: js.Array[Vector2], segments: js.UndefOr[Double] = js.undefined, phiStart: js.UndefOr[Double] = js.undefined, phiLength: js.UndefOr[Double] = js.undefined) = this()

	var parameters: AnonObject81 = js.native


@js.native
@JSGlobal("THREE.LatheGeometry")
object LatheGeometry extends js.Object:
	def fromJSON(data: js.Any): LatheGeometry = js.native


trait TextGeometryParameters extends js.Object:
	var font: Font 
	var size: js.UndefOr[Double] = js.undefined
	var height: js.UndefOr[Double] = js.undefined
	var curveSegments: js.UndefOr[Double] = js.undefined
	var bevelEnabled: js.UndefOr[Boolean] = js.undefined
	var bevelThickness: js.UndefOr[Double] = js.undefined
	var bevelSize: js.UndefOr[Double] = js.undefined
	var bevelOffset: js.UndefOr[Double] = js.undefined
	var bevelSegments: js.UndefOr[Double] = js.undefined

@js.native
@JSGlobal("THREE.TextGeometry")
class TextGeometry extends ExtrudeGeometry:
	def this(text: String, parameters: TextGeometryParameters) = this()

	var parameters: AnonObject82 = js.native

@js.native
@JSGlobal("THREE.TorusGeometry")
class TorusGeometry extends BufferGeometry:
	def this(radius: js.UndefOr[Double] = js.undefined, tube: js.UndefOr[Double] = js.undefined, radialSegments: js.UndefOr[Double] = js.undefined, tubularSegments: js.UndefOr[Double] = js.undefined, arc: js.UndefOr[Double] = js.undefined) = this()

	var parameters: AnonObject83 = js.native


@js.native
@JSGlobal("THREE.TorusGeometry")
object TorusGeometry extends js.Object:
	def fromJSON(data: js.Any): TorusGeometry = js.native

@js.native
@JSGlobal("THREE.TetrahedronGeometry")
class TetrahedronGeometry extends PolyhedronGeometry:
	def this(radius: js.UndefOr[Double] = js.undefined, detail: js.UndefOr[Double] = js.undefined) = this()



@js.native
@JSGlobal("THREE.TetrahedronGeometry")
object TetrahedronGeometry extends js.Object:
	def fromJSON(data: js.Any): TetrahedronGeometry = js.native

@js.native
@JSGlobal("THREE.TubeGeometry")
class TubeGeometry extends BufferGeometry:
	def this(path: Curve[Vector3], tubularSegments: js.UndefOr[Double] = js.undefined, radius: js.UndefOr[Double] = js.undefined, radiusSegments: js.UndefOr[Double] = js.undefined, closed: js.UndefOr[Boolean] = js.undefined) = this()

	var parameters: AnonObject84 = js.native
	var tangents: js.Array[Vector3] = js.native
	var normals: js.Array[Vector3] = js.native
	var binormals: js.Array[Vector3] = js.native


@js.native
@JSGlobal("THREE.TubeGeometry")
object TubeGeometry extends js.Object:
	def fromJSON(data: js.Any): TubeGeometry = js.native

@js.native
trait AnonObject75 extends js.Object:
	var width: Double = js.native
	var height: Double = js.native
	var widthSegments: Double = js.native
	var heightSegments: Double = js.native

@js.native
trait AnonObject64 extends js.Object:
	var value: js.Array[js.Any] = js.native
	var properties: AnonObject85 = js.native

@js.native
trait AnonObject71 extends js.Object:
	var innerRadius: Double = js.native
	var outerRadius: Double = js.native
	var thetaSegments: Double = js.native
	var phiSegments: Double = js.native
	var thetaStart: Double = js.native
	var thetaLength: Double = js.native

@js.native
trait AnonObject68 extends js.Object:
	var value: js.Array[js.Any] = js.native
	var properties: AnonObject86 = js.native

@js.native
trait AnonObject76 extends js.Object:
	var width: Double = js.native
	var height: Double = js.native
	var depth: Double = js.native
	var widthSegments: Double = js.native
	var heightSegments: Double = js.native
	var depthSegments: Double = js.native

@js.native
trait AnonObject74 extends js.Object:
	var radius: Double = js.native
	var tube: Double = js.native
	var tubularSegments: Double = js.native
	var radialSegments: Double = js.native
	var p: Double = js.native
	var q: Double = js.native

@js.native
trait AnonObject83 extends js.Object:
	var radius: Double = js.native
	var tube: Double = js.native
	var radialSegments: Double = js.native
	var tubularSegments: Double = js.native
	var arc: Double = js.native

@js.native
trait AnonObject70 extends js.Object:
	var directionalLength: Double = js.native
	var pointLength: Double = js.native
	var spotLength: Double = js.native
	var rectAreaLength: Double = js.native
	var hemiLength: Double = js.native
	var numDirectionalShadows: Double = js.native
	var numPointShadows: Double = js.native
	var numSpotShadows: Double = js.native

@js.native
trait AnonObject69 extends js.Object:
	var value: js.Array[js.Any] = js.native
	var properties: AnonObject87 = js.native

@js.native
trait AnonObject72 extends js.Object:
	var radiusTop: Double = js.native
	var radiusBottom: Double = js.native
	var height: Double = js.native
	var radialSegments: Double = js.native
	var heightSegments: Double = js.native
	var openEnded: Boolean = js.native
	var thetaStart: Double = js.native
	var thetaLength: Double = js.native

@js.native
trait AnonObject78 extends js.Object:
	var thresholdAngle: Double = js.native

@js.native
trait AnonObject73 extends js.Object:
	var func: js.Function3[Double,Double,Vector3,Unit] = js.native
	var slices: Double = js.native
	var stacks: Double = js.native

@js.native
trait AnonObject65 extends js.Object:
	var value: js.Array[js.Any] = js.native
	var properties: AnonObject88 = js.native

@js.native
trait AnonObject80 extends js.Object:
	var vertices: js.Array[Double] = js.native
	var indices: js.Array[Double] = js.native
	var radius: Double = js.native
	var detail: Double = js.native

@js.native
trait AnonObject67 extends js.Object:
	var value: js.Array[js.Any] = js.native
	var properties: AnonObject89 = js.native

@js.native
trait AnonObject84 extends js.Object:
	var path: Curve[Vector3] = js.native
	var tubularSegments: Double = js.native
	var radius: Double = js.native
	var radialSegments: Double = js.native
	var closed: Boolean = js.native

@js.native
trait AnonObject79 extends js.Object:
	var radius: Double = js.native
	var segments: Double = js.native
	var thetaStart: Double = js.native
	var thetaLength: Double = js.native

@js.native
trait AnonObject66 extends js.Object:
	var value: js.Array[js.Any] = js.native
	var properties: AnonObject90 = js.native

@js.native
trait AnonObject81 extends js.Object:
	var points: js.Array[Vector2] = js.native
	var segments: Double = js.native
	var phiStart: Double = js.native
	var phiLength: Double = js.native

@js.native
trait AnonObject82 extends js.Object:
	var font: Font = js.native
	var size: Double = js.native
	var height: Double = js.native
	var curveSegments: Double = js.native
	var bevelEnabled: Boolean = js.native
	var bevelThickness: Double = js.native
	var bevelSize: Double = js.native
	var bevelOffset: Double = js.native
	var bevelSegments: Double = js.native

@js.native
trait AnonObject77 extends js.Object:
	var radius: Double = js.native
	var widthSegments: Double = js.native
	var heightSegments: Double = js.native
	var phiStart: Double = js.native
	var phiLength: Double = js.native
	var thetaStart: Double = js.native
	var thetaLength: Double = js.native
