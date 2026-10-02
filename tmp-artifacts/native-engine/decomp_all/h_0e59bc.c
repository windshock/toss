// entry=0xe59bc

void He59bc(undefined8 *param_1)

{
  uint uVar1;
  undefined8 uVar2;
  long unaff_x19;
  
  uVar2 = (*(code *)*param_1)(*(undefined8 *)(unaff_x19 + 0x58),*(undefined8 *)(unaff_x19 + 0x30));
  uVar1 = -(int)DAT_002765f0;
                    /* WARNING: Could not recover jumptable at 0x001e996c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002813c0)
            (&DAT_0029e620 +
             (long)(int)((uVar1 | 0x7b9ee79e) + (uVar1 & 0x7b9ee79e)) * 0x2b +
             (long)(int)(0x7b9ee7b1 - (-(int)DAT_002765f0 ^ 0xffffffffU)),uVar2,uVar2);
  return;
}


