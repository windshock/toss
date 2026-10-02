// entry=0xd4c80

void Hd4c80(undefined8 param_1)

{
  ulong uVar1;
  ulong uVar2;
  undefined8 in_x12;
  undefined8 in_x13;
  undefined8 unaff_x20;
  long unaff_x21;
  long unaff_x29;
  
  uVar2 = -DAT_0027db08;
  uVar1 = -DAT_0027db08;
  *(undefined8 *)(unaff_x29 + -0x418) = param_1;
  *(long *)(unaff_x29 + -0xd0) = unaff_x21 + 9;
  *(long *)(unaff_x29 + -200) = unaff_x21 + 8;
  *(long *)(unaff_x29 + -0xc0) = unaff_x21 + 7;
  *(long *)(unaff_x29 + -0xb8) = unaff_x21 + 6;
  *(ulong *)(unaff_x29 + -0xb0) =
       unaff_x21 + ((uVar1 | 0xf7e4037c65ce6968) + (uVar1 & 0xf7e4037c65ce6968)) * 0x7d + 5;
  *(ulong *)(unaff_x29 + -0xa8) =
       unaff_x21 + ((uVar2 ^ 0xf7e4037c65ce6968) + (uVar2 & 0xf7e4037c65ce6968) * 2) * 0x7d + 4;
  *(undefined8 *)(unaff_x29 + -0xa0) = in_x13;
  *(undefined8 *)(unaff_x29 + -0x98) = in_x12;
  *(undefined8 *)(unaff_x29 + -0xd8) = unaff_x20;
  *(long *)(unaff_x29 + -0xe0) = unaff_x21 + 10;
  *(long *)(unaff_x29 + -0xf0) = unaff_x21 + 0xb;
  *(long *)(unaff_x29 + -0xe8) = unaff_x21 + 0xc;
  *(ulong *)(unaff_x29 + -0x100) =
       unaff_x21 +
       ((-DAT_0027db08 ^ 0xf7e4037c65ce6968U) + (-DAT_0027db08 & 0xf7e4037c65ce6968U) * 2) * 0x7d +
       0xd;
  *(long *)(unaff_x29 + -0xf8) = unaff_x21 + 0xe;
  *(long *)(unaff_x29 + -0x128) = unaff_x21 + 0xf;
  *(long *)(unaff_x29 + -0x108) = unaff_x21 + 0x10;
  *(ulong *)(unaff_x29 + -0x150) =
       unaff_x21 + (-DAT_0027db08 ^ 0xf7e4037c65ce6979U) + (-DAT_0027db08 & 0xf7e4037c65ce6979U) * 2
  ;
  *(ulong *)(unaff_x29 + -0x158) =
       unaff_x21 + (-0x81bfc839a319699 - (-DAT_0027db08 ^ 0xffffffffffffffffU)) * 0x7d +
       (-DAT_0027db08 ^ 0xf7e4037c65ce697aU) + (-DAT_0027db08 & 0xf7e4037c65ce697aU) * 2;
  *(ulong *)(unaff_x29 + -0x170) =
       unaff_x21 + (-0x81bfc839a319699 - (-DAT_0027db08 ^ 0xffffffffffffffffU)) * 0x7d + 0x13;
  *(ulong *)(unaff_x29 + -0x178) =
       unaff_x21 +
       ((-DAT_0027db08 | 0xf7e4037c65ce6968U) + (-DAT_0027db08 & 0xf7e4037c65ce6968U)) * 0x7d + 0x14
  ;
  *(long *)(unaff_x29 + -0x1a0) = unaff_x21 + 0x15;
  *(long *)(unaff_x29 + -0x180) = unaff_x21 + 0x16;
  *(ulong *)(unaff_x29 + -0x1b0) =
       unaff_x21 +
       ((-DAT_0027db08 ^ 0xf7e4037c65ce6968U) + (-DAT_0027db08 & 0xf7e4037c65ce6968U) * 2) * 0x7d +
       0x17;
  *(ulong *)(unaff_x29 + -0x1d0) =
       unaff_x21 + (-0x81bfc839a319681 - (-DAT_0027db08 ^ 0xffffffffffffffffU));
  *(ulong *)(unaff_x29 + -0x1e8) =
       unaff_x21 + (-0x81bfc839a319699 - (-DAT_0027db08 ^ 0xffffffffffffffffU)) * 0x7d + 0x19;
                    /* WARNING: Could not recover jumptable at 0x001d76f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00279d58)();
  return;
}


